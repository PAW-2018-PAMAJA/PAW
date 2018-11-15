package Controller;

import javax.validation.Validator;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Representation.DTO.Card;

@Path("/boards/{id}/lists/{id}/cards/{id}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CardController extends EndpointController
{
	public CardController(final Validator validator)
	{
		super(validator);
	}

	@GET
	public Card getCards()
	{
		return new Card();
	}

	@POST
	public Card createCard()
	{
		return new Card();
	}

	@DELETE
	public Card removeCardById()
	{
		return new Card();
	}
}
