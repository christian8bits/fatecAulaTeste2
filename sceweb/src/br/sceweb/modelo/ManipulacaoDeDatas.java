package br.sceweb.modelo;
import java.util.Locale;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
//Manipulação de data e hora – utilizando Logger
public class ManipulacaoDeDatas {
	
	
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ManipulacaoDeDatas.class);
		DateTime dateTime = new DateTime();
		// Imprimindo a data no formato YYYY-MM-dd
		System.out.println("dateTime.toString() = " + dateTime.toString("YYYY-MM-dd"));
		// Imprimindo a data no formato YYYY-MM-dd HH:mm:ss
		System.out.println("dateTime.toString() = " + dateTime.toString("YYYY-MM-dd HH:mm:ss"));
		// Imprimindo o mês
		System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsText());
		// Imprimindo o mês
		System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsShortText());
		// Imprimindo o mês em Inglês
		logger.info("dateTime.toString() = " + dateTime.monthOfYear().getAsText(Locale.ENGLISH));
		}
}
