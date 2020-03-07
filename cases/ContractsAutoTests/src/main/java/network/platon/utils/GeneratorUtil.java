package network.platon.utils;

import lombok.extern.slf4j.Slf4j;
import network.platon.autotest.utils.FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.*;

/**
 * @title 将ABI文件和二进制文件生成包装类
 * @author: qcxiao
 * @create: 2019/12/27 13:53
 **/
@Slf4j
public class GeneratorUtil {
    private static final Semaphore permit = new Semaphore(100, true);

    public static void main(String[] args) {
        try {
            generator("test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @description:
     * @author: qcxiao
     * @create: 2019/12/14 16:34
     **/
    public static void generator(String contractName) throws Exception {
        Process ps = null;
        BufferedReader br = null;
        try {
            permit.acquire();
            String filePath = FileUtil.pathOptimization(Paths.get("src", "test", "resources", "contracts", "evm", "build").toUri().getPath());
            String binPath = filePath + contractName + ".bin";
            String abiPath = filePath + contractName + ".abi";

            String outputPath = FileUtil.pathOptimization(System.getProperty("user.dir") + "/src/main/java");
            String packagePath = "network.platon.contracts";

            String os = System.getProperty("os.name");
            String[] args = null;
            String rootPath = FileUtil.pathOptimization(Paths.get("scripts", "platon-web3j", "bin").toUri().getPath());

            if (!os.startsWith("Linux") && !os.startsWith("Mac OS")) {
                if (os.startsWith("Windows")) {
                    args = new String[]{"cmd", "/C", rootPath + "platon-web3j.bat" + " " + "solidity" + " " + "generate" + " " + binPath + " " + abiPath + " " + "-o" + " " + outputPath + " " + "-p" + " " + packagePath};
                } else {
                    System.out.println("Not supported operate system platform");
                }
            } else {
                args = new String[]{"/bin/bash", "-c", rootPath + "platon-web3j" + " " + "solidity" + " " + "generate" + " " + binPath + " " + abiPath + " " + "-o" + " " + outputPath + " " + "-p" + " " + packagePath};
            }

            System.out.println("args:" + Arrays.toString(args));
            ps = Runtime.getRuntime().exec(args);
            ps.waitFor(2, TimeUnit.SECONDS);
            br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
            StringBuffer sb = new StringBuffer();

            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

            String result = sb.toString();
            log.debug("result:{}", result);
        } catch (Exception e) {
            log.error("contract generator error:{}", e.getMessage());
            throw new Exception(e);
        } finally {
            br.close();
            ps.destroy();
            permit.release();
        }
    }

    public void generatorWasm(String contractName) throws Exception {
        Process ps = null;
        BufferedReader br = null;
        try {
            permit.acquire();
            String filePath = FileUtil.pathOptimization(Paths.get("src", "test", "resources", "contracts", "wasm", "build").toUri().getPath());
            String binPath = filePath + contractName + ".wasm";
            String abiPath = filePath + contractName + ".abi.json";

            String outputPath = FileUtil.pathOptimization(System.getProperty("user.dir") + "/src/main/java");
            String packagePath = "network.platon.contracts.wasm";
            String rootPath = System.getProperty("user.dir");
            System.out.println("rootPath:" + rootPath);
            String[] args = new String[]{"/bin/bash", "-c", rootPath + "/scripts/platon-web3j/bin/platon-web3j" + " " + "wasm" + " " + "generate" + " " + binPath + " " + abiPath + " " + "-o" + " " + outputPath + " " + "-p" + " " + packagePath};

            ps = Runtime.getRuntime().exec(args);
            ps.waitFor(2, TimeUnit.SECONDS);
            br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
            StringBuffer sb = new StringBuffer();

            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

            String result = sb.toString();
            System.out.println(result);
        } catch (Exception e) {
            log.error("contract generator error:{}", e.getMessage());
            throw new Exception(e);
        } finally {
            br.close();
            ps.destroy();
            permit.release();
        }
    }
}