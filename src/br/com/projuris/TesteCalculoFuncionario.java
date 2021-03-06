package br.com.projuris;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class TesteCalculoFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
		Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
		Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
		Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
		Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500));
		Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
		Funcionario funcionario7 = new Funcionario("Estagi�rio", "Jur�dico", new BigDecimal(700.4));
		Funcionario funcionario8 = new Funcionario("Assistente", "Jur�dico", new BigDecimal(1800.90));
		Funcionario funcionario9 = new Funcionario("Gerente", "Jur�dico", new BigDecimal(9500.50));
		Funcionario funcionario10 = new Funcionario("Diretor", "Jur�dico", new BigDecimal(13000.0));
		
		List<Funcionario> listaFuncionario = new ArrayList<>();
		listaFuncionario.add(funcionario1);
		listaFuncionario.add(funcionario2);
		listaFuncionario.add(funcionario3);
		listaFuncionario.add(funcionario4);
		listaFuncionario.add(funcionario5);
		listaFuncionario.add(funcionario6);
		listaFuncionario.add(funcionario7);
		listaFuncionario.add(funcionario8);
		listaFuncionario.add(funcionario9);
		listaFuncionario.add(funcionario10);
		
		MyCalculo myCalculo = new MyCalculo();
		List<CustoCargo> listCustoCargo = myCalculo.custoPorCargo(listaFuncionario);
		List<CustoDepartamento> listCustoDepartamento = myCalculo.custoPorDepartamento(listaFuncionario);		
		
		System.out.println(" - Custos por Cargo: ");
		for (CustoCargo custoCargo : listCustoCargo) {
			
			System.out.println(" " + custoCargo.getCargo() + ": " + NumberFormat.getCurrencyInstance().format(custoCargo.getCusto()));			
		}
		
		System.out.println(" - Custos por Departamento: ");
		for (CustoDepartamento custoDepartamento : listCustoDepartamento) {
			System.out.println(" " + custoDepartamento.getDepartamento() + ": " + NumberFormat.getCurrencyInstance().format(custoDepartamento.getCusto()));			
		}
	}

}
