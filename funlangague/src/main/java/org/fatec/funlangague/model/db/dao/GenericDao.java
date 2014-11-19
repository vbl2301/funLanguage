/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fatec.funlangague.model.db.dao;

import java.util.List;
import org.fatec.funlangague.model.AbstractEntity;


/**
 *
 * @author Aluno_Enfase
 */
public interface GenericDao<E extends AbstractEntity> {

    boolean add(E o);

    E find(long id);

    List<E> list();

    int remove(long id);

    int update(E o);
    
}
