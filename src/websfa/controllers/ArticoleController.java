package websfa.controllers;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import websfa.beans.CautaPret;
import websfa.beans.articole.Articol;
import websfa.beans.articole.ArticolInfoVanzare;
import websfa.beans.articole.ArticolPret;
import websfa.beans.articole.ArticolStoc;
import websfa.model.articole.OperatiiArticole;


@Controller
@Scope("session")
public class ArticoleController {

	@RequestMapping(value = "/cautaArticol", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public List<Articol> cautaArticole(@RequestBody Articol articolCautare) {

		return new OperatiiArticole().cautaArticole(articolCautare);

	}

	@RequestMapping(value = "/stoc", produces = "application/json")
	@ResponseBody
	public List<ArticolStoc> afiseazaStoc(String codArticol, String filiala) {

		return new OperatiiArticole().getStoc(codArticol, filiala);

	}


	@RequestMapping(value = "/pret", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ArticolPret afiseazaPret(@RequestBody CautaPret cautaPret) {

		return new OperatiiArticole().getPret(cautaPret);

	}

	@RequestMapping(value = "/stocdepozit", produces = "application/json")
	@ResponseBody
	public ArticolStoc afiseazaStocDepozit(String codArticol, String filiala, String depozit) {

		return new OperatiiArticole().getStoc(codArticol, filiala, depozit);

	}

	@RequestMapping(value = "/articolvanzare", produces = "application/json")
	@ResponseBody
	public ArticolInfoVanzare getInfoArticolVanzare(String codArticol, String filiala, String depozit, String codDepart) {

		ArticolInfoVanzare artInfo = new ArticolInfoVanzare();
		artInfo.setStocArticol(new OperatiiArticole().getStoc(codArticol, filiala, depozit));

		return artInfo;

	}

}
