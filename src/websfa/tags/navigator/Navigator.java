package websfa.tags.navigator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import websfa.beans.nagivation.NavigationDetails;
import websfa.enums.EnumMeniu;
import websfa.helpers.HelperMeniu;
import websfa.model.articole.OperatiiComenzi;

public class Navigator extends SimpleTagSupport {

	private List<NavigationDetails> navigationLinks;

	private String tipUser;
	private String codDepart;

	public String getTipUser() {
		return tipUser;
	}

	public void setTipUser(String tipUser) {
		this.tipUser = tipUser;
	}

	public List<NavigationDetails> getNavigationLinks() {
		return navigationLinks;
	}

	public void setNavigationLinks(List<NavigationDetails> navigationLinks) {
		this.navigationLinks = navigationLinks;
	}

	public String getCodDepart() {
		return codDepart;
	}

	public void setCodDepart(String codDepart) {
		this.codDepart = codDepart;
	}

	private void createNavigationLinks() {

		navigationLinks = new ArrayList<>();

		PageContext pageContext = (PageContext) getJspContext();
		String root = pageContext.getServletContext().getContextPath();

		NavigationDetails nd;

		nd = new NavigationDetails();
		nd.setLink(String.format("%s/comanda", root));
		nd.setText("Creare comanda");
		nd.setNume(EnumMeniu.CREARE_COMANDA);
		HelperMeniu.addMenuOption(navigationLinks, nd, tipUser);

		nd = new NavigationDetails();
		nd.setLink(String.format("%s/modifcmd", root));
		nd.setText("Modificare comanda");
		nd.setNume(EnumMeniu.MODIFICARE_COMANDA);
		HelperMeniu.addMenuOption(navigationLinks, nd, tipUser);

		nd = new NavigationDetails();
		nd.setLink(String.format("%s/afiscom", root));
		nd.setText("Afisare comanda");
		nd.setNume(EnumMeniu.AFISARE_COMANDA);
		HelperMeniu.addMenuOption(navigationLinks, nd, tipUser);

		nd = new NavigationDetails();
		nd.setLink(String.format("%s/aprobacmd", root));
		nd.setText("Aprobare comanda");
		nd.setNume(EnumMeniu.APROBARE_COMANDA);
		if (tipUser.equals("SD"))
			nd.setNavNumber(new OperatiiComenzi().getComenziAprobareSD(codDepart));
		HelperMeniu.addMenuOption(navigationLinks, nd, tipUser);

		nd = new NavigationDetails();
		nd.setLink(String.format("%s/stocuri", root));
		nd.setText("Stocuri");
		nd.setNume(EnumMeniu.STOCURI);
		HelperMeniu.addMenuOption(navigationLinks, nd, tipUser);

		nd = new NavigationDetails();
		nd.setLink(String.format("%s/preturi", root));
		nd.setText("Preturi");
		nd.setNume(EnumMeniu.PRETURI);
		HelperMeniu.addMenuOption(navigationLinks, nd, tipUser);

		nd = new NavigationDetails();
		nd.setLink(String.format("%s/exit", root));
		nd.setText("Iesire");
		nd.setNume(EnumMeniu.EXIT);
		navigationLinks.add(nd);

	}

	@Override
	public void doTag() throws JspException, IOException {

		createNavigationLinks();

		for (NavigationDetails nd : navigationLinks) {
			getJspContext().setAttribute("navdetails", nd);
			getJspBody().invoke(null);
		}
	}

}
