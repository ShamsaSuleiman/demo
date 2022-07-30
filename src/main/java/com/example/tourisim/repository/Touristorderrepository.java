package com.example.tourisim.repository;

import java.time.LocalDate;
import java.util.List;

import com.example.tourisim.dto.Order;
import com.example.tourisim.model.Touristorder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;





public interface Touristorderrepository extends JpaRepository<Touristorder,Long>{
    @Query(value ="SELECT touristorder.id,touristorder.customerid,touristorder.packageid,customer.firstname,customer.lastname,tourismpackages.name,tourismpackages.cost from touristorder,customer,tourismpackages where touristorder.customerid=customer.id and touristorder.packageid=tourismpackages.id",nativeQuery=true)
    List<Order>getOrder();
    @Query(value="SELECT touristorder.id,touristorder.customerid,touristorder.packageid,customer.firstname,customer.lastname,tourismpackages.name as packname,tourismpackages.cost from touristorder,customer,tourismpackages where touristorder.customerid=customer.id and touristorder.packageid=tourismpackages.id and customer.id=? and packageid=?",nativeQuery = true)
    Order getOrderbyid(Long customerid,Long packageid);

    // @Query(value="SELECT touristorder.id,touristorder.customerid,touristorder.packageid,customer.firstname,customer.lastname,tourismpackages.name,tourismpackages.cost from touristorder,customer,tourismpackages where touristorder.customerid=customer.id and touristorder.packageid=tourismpackages.id and tourismpackages.startdate BETWEEN '?1' AND ?2'",nativeQuery = true)
    // List<Order>getOrderbyid (LocalDate from,LocalDate to);



}
