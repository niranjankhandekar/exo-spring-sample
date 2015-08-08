package com.exoSpringSample.controller;

import java.util.List;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;

import com.exoSpringSample.model.Contact;
import com.exoSpringSample.service.ContactService;


public class ContactPortlet extends AbstractController {

	private ContactService contactService;
	public void setContactService(ContactService contactService) {
	this.contactService = contactService;
	}
	public ModelAndView handleRenderRequestInternal(RenderRequest request, RenderResponse response) {
	List<Contact> contacts = contactService.getContacts();
	ModelAndView modelAndView = new ModelAndView("contactsView", "contacts", contacts);
	return modelAndView;
	}

}
