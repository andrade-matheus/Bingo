/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo.persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus
 */
public class BingoPersistenciaImplArquivo implements IBingoPersistencia{
    
    List<Integer> sorteados;
    
    private void load(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bingo.tri"));
            sorteados = (List<Integer>)ois.readObject();
            ois.close();
        }catch(Exception erro){
            sorteados = new ArrayList<Integer>();
        }
    }
    
    private void save(){
         try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bingo.tri"));
            oos.writeObject(sorteados);
            oos.close();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    
    @Override
    public Integer get(Integer numero) {
        load();
        Object[] filtro = sorteados.stream().filter(f -> f.equals(numero)).toArray();
        if(filtro.length == 1){
            return (Integer) filtro[0];
        }
        return null;
    }

    @Override
    public boolean update(Integer numero) {
        load();
        for (int i = 0; i < sorteados.size(); i++) {
            Integer get = sorteados.get(i);
            if(get.equals(numero)){
                sorteados.set(i, numero);
                break;
            }
        }
        save();
        return true;
    }

    @Override
    public boolean put(Integer numero) {
        if(get(numero) == null){
            sorteados.add(numero);
            save();
        }
        return true;
    }

    @Override
    public boolean delete(Integer numero) {
        load();
        for (int i = 0; i < sorteados.size(); i++) {
            Integer get = sorteados.get(i);
            if(get.equals(numero)){
                sorteados.remove(i);
                break;
            }
        }
        save();
        return true;
    }

    @Override
    public List<Integer> listar() {
        load();
        return sorteados;
    }
}
