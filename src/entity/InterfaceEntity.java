/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Developer
 */
public interface InterfaceEntity {
    /**
     * Método criado para captura de todas as informações
     * da entidade em formato de vetor de Objects.
     * Pode ser usado para inserir os dados de uma entidade
     * diretamente em uma linha em uma JTable.
     * @return Object[]
     */
    public Object[] getDadosEmVetor();
}
