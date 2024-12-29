package com.moa.member.domain.member.repository;

import com.yubico.webauthn.CredentialRepository;
import com.yubico.webauthn.RegisteredCredential;
import com.yubico.webauthn.data.ByteArray;
import com.yubico.webauthn.data.PublicKeyCredentialDescriptor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Component
@Repository
public class EmptyCredentialRepository implements CredentialRepository {

	@Override
	public Set<PublicKeyCredentialDescriptor> getCredentialIdsForUsername(String s) {
		return Set.of();
	}

	@Override
	public Optional<ByteArray> getUserHandleForUsername(String s) {
		return Optional.empty();
	}

	@Override
	public Optional<String> getUsernameForUserHandle(ByteArray byteArray) {
		return Optional.empty();
	}

	@Override
	public Optional<RegisteredCredential> lookup(ByteArray byteArray, ByteArray byteArray1) {
		return Optional.empty();
	}

	@Override
	public Set<RegisteredCredential> lookupAll(ByteArray byteArray) {
		return Set.of();
	}
}
