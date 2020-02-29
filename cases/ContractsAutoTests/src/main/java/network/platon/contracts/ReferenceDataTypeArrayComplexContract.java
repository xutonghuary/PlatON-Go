package network.platon.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
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
public class ReferenceDataTypeArrayComplexContract extends Contract {
    private static final String BINARY = "60806040526040518060400160405280600160ff168152602001600260ff168152506000906002610031929190610044565b5034801561003e57600080fd5b506100bb565b828054828255906000526020600020908101928215610085579160200282015b82811115610084578251829060ff16905591602001919060010190610064565b5b5090506100929190610096565b5090565b6100b891905b808211156100b457600081600090555060010161009c565b5090565b90565b610180806100ca6000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c806310c037da14610030575b600080fd5b6100a76004803603602081101561004657600080fd5b810190808035906020019064010000000081111561006357600080fd5b82018360208201111561007557600080fd5b8035906020019184602083028401116401000000008311171561009757600080fd5b90919293919293905050506100bd565b6040518082815260200191505060405180910390f35b6000806000905060008090505b8484905082101561013f576000829050600a8111156100e9575061013f565b60008686838181106100f757fe5b9050602002013590506103e881106101165760018401935050506100ca565b80830192506101f483106101305782945050505050610145565b838060010194505050506100ca565b80925050505b9291505056fea265627a7a723158201f1c5b82313845ecf07f0b473f589d44c37a470f1691838825a3d3aeb49a195e64736f6c634300050d0032";

    public static final String FUNC_SUMCOMPLEXARRAY = "sumComplexArray";

    @Deprecated
    protected ReferenceDataTypeArrayComplexContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ReferenceDataTypeArrayComplexContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ReferenceDataTypeArrayComplexContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ReferenceDataTypeArrayComplexContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> sumComplexArray(List<BigInteger> array) {
        final Function function = new Function(FUNC_SUMCOMPLEXARRAY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(array, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<ReferenceDataTypeArrayComplexContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeArrayComplexContract.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ReferenceDataTypeArrayComplexContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ReferenceDataTypeArrayComplexContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<ReferenceDataTypeArrayComplexContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(ReferenceDataTypeArrayComplexContract.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ReferenceDataTypeArrayComplexContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ReferenceDataTypeArrayComplexContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static ReferenceDataTypeArrayComplexContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ReferenceDataTypeArrayComplexContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ReferenceDataTypeArrayComplexContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ReferenceDataTypeArrayComplexContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ReferenceDataTypeArrayComplexContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ReferenceDataTypeArrayComplexContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ReferenceDataTypeArrayComplexContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ReferenceDataTypeArrayComplexContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
