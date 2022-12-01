package implementacao;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.HashMap;

public class LZW {

    public HashMap<String, String> dicionario;
    public RandomAccessFile arquivoDescomprimido;
    public RandomAccessFile arquivoComprimido;

    public String nomeArquivo;

    public LZW(String nomeArquivo) throws FileNotFoundException {
        this(nomeArquivo, Operacao.COMPRESSAO);
    }

    public LZW(String nomeArquivo, Operacao operacao) throws FileNotFoundException {
        iniciarDicionario();
        abrirArquivo(nomeArquivo, operacao);
    }


    public void iniciarDicionario() {
        dicionario = new HashMap<>();
    }

    public void abrirArquivo(String nomeArquivo, Operacao o) throws FileNotFoundException {

        if (o == Operacao.COMPRESSAO) 

            this.arquivoDescomprimido = new RandomAccessFile(nomeArquivo, "r");

        else 

            this.arquivoComprimido = new RandomAccessFile(nomeArquivo, "rb");

    }

    public static void main(String[] args) {
        System.out.println("rada calvo");
    }
    
}