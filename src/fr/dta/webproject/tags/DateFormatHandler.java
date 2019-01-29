package fr.dta.webproject.tags;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class DateFormatHandler extends SimpleTagSupport { 
	
	private Date date; 
	private String format;
	private String couleur;
	
	@Override
	public void doTag() throws JspException, IOException {  
		SimpleDateFormat dateFormatter = new SimpleDateFormat(format); 
		JspWriter out = getJspContext().getOut(); 
		out.println(dateFormatter.format(date)); 
		out.println(couleur);
		
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	
	public void setDate(Date date) { 
		this.date = date;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}

//On fait les getter setter automatiquement après avoir écris le Date et String et doTag()
//La classe comportant le tag doit être faite dans un package créé par moi-même
//ne pas oublier le extends SimpleTagSupport ainsi que l'importation de java.util.date
// ce tag formate les dates, donc je crée deux attributs qui seront pris en compte, à savoir la date et le format
//date pour l'attribut date et string pour le format choisi
//la fonction doTag() peut se faire automatiquement
//on utilise la méthode SimpleDateFormat puis on la nomme ici dateFormatter
//On appelle getJspContext().getOut() et l'incorpore dans un Writer
//avec printIn, on affiche le contenu du Writer
//au final on formate et affiche le résultat grâce à ces 2 fonctions








