package org.soa.ws.tp3;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="ConvertisseurDinarEuro")
public interface Convertisseur {
	
	@WebMethod
	@WebResult(name="montantDinar")
	public double getDinarFromEuro(@WebParam(name="montantEuro")double euro); 
	
	@WebMethod(operationName="DinarVersEuro")
	public double getEuroFromDinar(double dinar);
	
}

