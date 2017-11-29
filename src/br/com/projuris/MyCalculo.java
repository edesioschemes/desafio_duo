package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MyCalculo implements Calculo {

	@Override
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {

		CustoCargo custoCargo;
		List<CustoCargo> listCustoCargo = new ArrayList<>();

		Map<String, BigDecimal> funcionariosByCargo = new HashMap<String, BigDecimal>();

		for (Funcionario funcionario : funcionarios) {
			if (funcionariosByCargo.containsKey(funcionario.getCargo())) {
				funcionariosByCargo.put(funcionario.getCargo(),
						funcionariosByCargo.get(funcionario.getCargo()).add(funcionario.getSalario()));
			} else {
				funcionariosByCargo.put(funcionario.getCargo(), funcionario.getSalario());
			}
		}

		for (Entry<String, BigDecimal> hashFunc : funcionariosByCargo.entrySet()) {
			custoCargo = new CustoCargo();
			custoCargo.setCargo(hashFunc.getKey());
			custoCargo.setCusto(hashFunc.getValue());
			listCustoCargo.add(custoCargo);
		}

		return listCustoCargo;
	}

	@Override
	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {

		CustoDepartamento custoDepartamento;
		List<CustoDepartamento> listCustoDepartamento = new ArrayList<>();

		Map<String, BigDecimal> funcionariosByDepartamento = new HashMap<String, BigDecimal>();

		for (Funcionario funcionario : funcionarios) {
			if (funcionariosByDepartamento.containsKey(funcionario.getDepartamento())) {
				funcionariosByDepartamento.put(funcionario.getDepartamento(),
						funcionariosByDepartamento.get(funcionario.getDepartamento()).add(funcionario.getSalario()));
			} else {
				funcionariosByDepartamento.put(funcionario.getDepartamento(), funcionario.getSalario());
			}
		}

		for (Entry<String, BigDecimal> hashFunc : funcionariosByDepartamento.entrySet()) {
			custoDepartamento = new CustoDepartamento();
			custoDepartamento.setDepartamento(hashFunc.getKey());
			custoDepartamento.setCusto(hashFunc.getValue());
			listCustoDepartamento.add(custoDepartamento);
		}

		return listCustoDepartamento;

	}

}
