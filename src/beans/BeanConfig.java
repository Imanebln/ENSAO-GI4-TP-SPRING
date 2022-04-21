package beans;

import com.ensa.gi4.datatabase.MaterielDAO;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.AllocationMaterielService;
import com.ensa.gi4.service.impl.AllocationMaterielServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig {
    @Bean
    public MaterielDAO materielDAO()
    {
        return new MaterielDAO();
    }
    @Bean
    public AllocationMaterielServiceImpl allocationMaterielService(AllocationMaterielServiceImpl allocationMaterielServiceImpl)
    {
        allocationMaterielServiceImpl.setMaterielDao(materielDAO());
        return allocationMaterielServiceImpl;
    }
}
