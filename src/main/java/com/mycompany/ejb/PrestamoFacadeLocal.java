
package com.mycompany.ejb;

import com.mycompany.model.Prestamo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jessica
 */
@Local
public interface PrestamoFacadeLocal {
    void create(Prestamo prestamo);

    void edit(Prestamo prestamo);

    void remove(Prestamo prestamo);

    Prestamo find(Object id);

    List<Prestamo> findAll();
}
