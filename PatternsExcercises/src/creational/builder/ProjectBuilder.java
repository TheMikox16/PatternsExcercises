/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

import java.util.Date;
import java.util.TreeSet;

/**
 *
 * Clase ProjectBuilder que identifica cada atributo a asignar al nuevo objeto.
 * Esto permite que gestione o se validen los datos que se quieran ingresar
 * y en el caso de ser erroneos evita la creacion de un nuevo objeto mediante
 * un ProjectException. Extiende al AbstractBuilder.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class ProjectBuilder implements AbstractBuilder{

    protected Project project;
    
    @Override
    public void buildProject(){
        project = new Project();
    }
    
    @Override
    public void buildName(String name) {
        project.setName(name);
    }

    @Override
    public void buildManager(Employee manager) {
        if(manager != null && (manager.getId() != null && manager.getId() != "")){
            project.setManager(manager);
        }
    }

    @Override
    public void buildWeeks(int weeks) {
        if(weeks > 0){
            project.setWeeks(weeks);
        }
    }

    @Override
    public void builDate(TreeSet<Date> dates) {
        if((dates != null) && (!dates.isEmpty())){
            project.setList(dates);
        }
    }

    @Override
    public Project getProject() throws ProjectException {
        if(project.getManager() == null){
            throw new ProjectException("el encargado no existe o no tiene id");
        }
        if(project.getWeeks() == 0){
            throw new ProjectException("el tiempo en semanas debe ser mayor a 0");
        }
        if(project.getList() == null){
            throw new ProjectException("la lista no existe o esta vacia");
        }
        return project;
    }

    
    
}
