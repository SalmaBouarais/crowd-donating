package org.mql.crowddonating.business.implementations;

import java.util.List;

import javax.transaction.Transactional;

import org.mql.crowddonating.business.IPublicServices;
import org.mql.crowddonating.dao.CaseRepository;
import org.mql.crowddonating.dao.TypeRepository;
import org.mql.crowddonating.dao.UserRepository;
import org.mql.crowddonating.models.Association;
import org.mql.crowddonating.models.Case;
import org.mql.crowddonating.models.Domain;
import org.mql.crowddonating.models.Event;
import org.mql.crowddonating.models.Sponsor;
import org.mql.crowddonating.models.Type;
import org.mql.crowddonating.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PublicServicesBusiness implements IPublicServices {

	@Autowired
	private CaseRepository caseDao;

	@Autowired
	private TypeRepository typeDao;

	@Autowired
	private UserRepository userDao;

	public List<Case> getAllCases() {
		return caseDao.findAll();
	}

	public Case getCaseById(long id) {
		return caseDao.findById(id).get();
	}

	public List<Case> getCasesByName(String name) {
		return caseDao.findByNameLike(name);
	}

	@Override
	public Case getCaseBySlug(String slug) {
		return caseDao.findBySlug(slug);
	}

	public List<Type> getAllTypes() {
		return typeDao.findAll();
	}

	@Override
	public Association addAssociation(Association association) {
		return userDao.save(association);
	}

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getAllEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Case getEventById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Case> getEventByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sponsor> getAllSponsors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Case getSponsorById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Case> getSponsorByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Association> getAllAssociations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Association> getAssociationsByDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Association> getAssociationsByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Association getAssociationById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Domain> getAllDomains() {
		// TODO Auto-generated method stub
		return null;
	}

}
