package com.uty.exam11;

public class Member {
	private String id;

	public Member(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member target) {
			if (id.equals(target.getId())) {
				return true;
			}
		}
		return false;
	}

}
