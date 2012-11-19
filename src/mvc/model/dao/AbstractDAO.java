package mvc.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public abstract class AbstractDAO implements InterfaceDAO, Serializable
{
    private static LogDAO historico;
    protected String nomeArquivoDados = "";
    protected ObjectOutputStream objectOut;
    protected ObjectInputStream objectIn;
    protected int index = 0000;
    
    public AbstractDAO() throws IOException 
    {
        historico = new LogDAO();
    }
  
    public LogDAO getHistorico() 
    {
        return historico;
    }
    
    @Override
    public int getIndex()
    {
        return index;
    }
    
    @Override
    public void acrescerIndex()
    {
        index += 1;
    }
    
    @Override
    public void abrirArmazenamentoEmArquivo() throws IOException
    {
        this.objectOut = new ObjectOutputStream(
                new FileOutputStream(nomeArquivoDados)
                );
    }
    
    @Override
    public void fecharArmazenamentoEmArquivo() throws IOException
    {
        this.objectOut.close();
    }
    
    @Override
    public void abrirLeituraDoArquivo() throws IOException
    {
        this.objectIn = new ObjectInputStream(
                new FileInputStream(nomeArquivoDados)
                );
    }
    
    @Override
    public void fecharLeituraDoArquivo() throws IOException
    {
        this.objectIn.close();
    }
}