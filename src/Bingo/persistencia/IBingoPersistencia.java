/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo.persistencia;

import java.util.List;

/**
 *
 * @author matheus
 */
public interface IBingoPersistencia {
    
    public Integer get(Integer numero);
    public boolean update(Integer numero);
    public boolean put(Integer numero);
    public boolean delete(Integer numero);
    public List<Integer> listar();
            
}
