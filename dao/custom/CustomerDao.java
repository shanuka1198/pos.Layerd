/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layerd.dao.custom;

import pos.layerd.dao.CrudDao;
import pos.layerd.dao.SuperDao;
import pos.layerd.entity.CustomerEntity;

/**
 *
 * @author HP
 */
public interface CustomerDao extends CrudDao<CustomerEntity, String> {
    @Override
    boolean add(CustomerEntity customerEntity)throws Exception;
}
