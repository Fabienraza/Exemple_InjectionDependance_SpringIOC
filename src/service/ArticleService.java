package service;

import dao.ArticleDAO;
import dao.IArticleDAO;



public class ArticleService implements IArticleservice{
	private final double tva=0.2;
	private IArticleDAO dao;
	//l'instanciation se fait par SPRING
	//pour accéder à l'objet via SPRING, il faut créer un setter
	
	public void setDao(IArticleDAO dao) {
		this.dao = dao;
	}


	public void affichePrixTTC() {
		double prixTTC = dao.getprixHT()+ dao.getprixHT()*tva;
		System.out.println("Prix en TTC :"+prixTTC);
	}
}
