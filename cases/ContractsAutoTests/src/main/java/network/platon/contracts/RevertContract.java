package network.platon.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.GasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.9.1.0-SNAPSHOT.
 */
public class RevertContract extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550610170806100606000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806314fef9361461003b578063de29278914610087575b600080fd5b6100716004803603604081101561005157600080fd5b8101908080359060200190929190803590602001909291905050506100a5565b6040518082815260200191505060405180910390f35b61008f610131565b6040518082815260200191505060405180910390f35b60008183101561011d576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260168152602001807f6669727374206c657373207468616e207365636f6e640000000000000000000081525060200191505060405180910390fd5b818303600181905550600154905092915050565b600060015490509056fea265627a7a723158203e2f8a903684cdb8d89cb7c9819e70ed3e757b7b5da4767cceda182eae03761364736f6c634300050d0032";

    public static final String FUNC_GETRESULT = "getResult";

    public static final String FUNC_TOSENDERAMOUNT = "toSenderAmount";

    @Deprecated
    protected RevertContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected RevertContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected RevertContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected RevertContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<RevertContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(RevertContract.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<RevertContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(RevertContract.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<RevertContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(RevertContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<RevertContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(RevertContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public RemoteCall<BigInteger> getResult() {
        final Function function = new Function(FUNC_GETRESULT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> toSenderAmount(BigInteger first, BigInteger second) {
        final Function function = new Function(
                FUNC_TOSENDERAMOUNT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(first), 
                new org.web3j.abi.datatypes.generated.Uint256(second)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static RevertContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new RevertContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static RevertContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new RevertContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static RevertContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new RevertContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static RevertContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new RevertContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
