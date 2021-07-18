package guru.springframework.cfgpetclinic.services;

import guru.springframework.cfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
