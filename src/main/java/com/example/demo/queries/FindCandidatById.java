package com.example.demo.queries;

public class FindCandidatById {
private int candidatId;

public Integer getCandidatId() {
	return candidatId;
}

public void setCandidatId(int candidatId) {
	this.candidatId = candidatId;
}

public FindCandidatById(int candidatId) {
	super();
	this.candidatId = candidatId;
}

}
