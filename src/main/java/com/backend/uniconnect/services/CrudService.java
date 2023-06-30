package com.backend.uniconnect.services;

import java.util.Optional;

public  interface CrudService <T,K> {

    Optional<T> getEntity(K k);

}
