package com.rubypaper.biz.client;

import com.rubypaper.biz.domain.Employee;
import com.rubypaper.biz.domain.EmployeeId;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class EmployeeServiceClient {
    public static void main(String[] args) {

        // 엔티티 매니저 팩토리 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Chapter02");

        // 엔티티 매니저 생성
        EntityManager em = emf.createEntityManager();

        // 엔티티 트랜잭션 생성
        EntityTransaction tx = em.getTransaction();

        try{
            EmployeeId empId = new EmployeeId(1L, "guest123");
            Employee findEmployee = em.find(Employee.class, empId);
            System.out.println("검색된 직원 정보 : " + findEmployee.toString());

        }catch (Exception e){
            e.printStackTrace();

            // 트랜잭션 종료(ROLLBACK)
            tx.rollback();
        }finally {
            // 엔티티 매니저 및 엔티티 매니저 팩토리 종료
            em.close();
            emf.close();
        }
    }
}
