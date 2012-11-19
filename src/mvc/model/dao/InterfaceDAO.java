package mvc.model.dao;

import java.io.IOException;
import java.util.List;

public interface InterfaceDAO 
{    
    public void inserir(Object o);
    public void atualizar(String id, Object newO);
    public void remover(Object o);
    public void remover(String id);
    public Object buscar(String id);
    public List buscarTodos();
    public int getMaiorIndexDaLista();
    public int getIndex();
    public void acrescerIndex();
    public void abrirArmazenamentoEmArquivo() throws IOException;
    public void fecharArmazenamentoEmArquivo() throws IOException;
    public void abrirLeituraDoArquivo() throws IOException;
    public void fecharLeituraDoArquivo() throws IOException;
    public void atualizarListaComArquivo() throws IOException;
    public void salvarListaEmArquivo() throws IOException;
}
