// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: CSProject::bw.ac.ub.cs::programme::service::ProgrammeService
 * STEREOTYPE:  Service
 */
package bw.ac.ub.cs.programme.service;

import bw.ac.ub.cs.Search;
import bw.ac.ub.cs.SearchParameter;
import bw.ac.ub.cs.programme.Programme;
import bw.ac.ub.cs.programme.ProgrammeDao;
import bw.ac.ub.cs.programme.vo.ProgrammeVO;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.ac.ub.cs.programme.service.ProgrammeService
 */
 @Transactional(propagation = Propagation.REQUIRED, readOnly=false)
@Service("programmeService")
public class ProgrammeServiceImpl
    extends ProgrammeServiceBase
{

    /**
     * @see bw.ac.ub.cs.programme.service.ProgrammeService#save(ProgrammeVO)
     */
    @Override
    protected  ProgrammeVO handleSave(ProgrammeVO programmeVO)
        throws Exception
    {
        if(programmeVO == null) {
            return null;
        }

        Programme programme = getProgrammeDao().programmeVOToEntity(programmeVO);
        return (ProgrammeVO) this.getProgrammeDao().create(ProgrammeDao.TRANSFORM_PROGRAMMEVO, programme);

    }

    /**
     * @see bw.ac.ub.cs.programme.service.ProgrammeService#findById(Long)
     */
    @Override
    protected  ProgrammeVO handleFindById(Long id)
        throws Exception
    {
        if(id == null) {
            return null;
        }

        return (ProgrammeVO) this.getProgrammeDao().load(ProgrammeDao.TRANSFORM_PROGRAMMEVO, id);
    }

    /**
     * @see bw.ac.ub.cs.programme.service.ProgrammeService#loadAll()
     */
    @Override
    protected  Collection<ProgrammeVO> handleLoadAll()
        throws Exception
    {
        return (Collection<ProgrammeVO>) getProgrammeDao().loadAll(ProgrammeDao.TRANSFORM_PROGRAMMEVO);
    }

    /**
     * @see bw.ac.ub.cs.programme.service.ProgrammeService#search(String, String)
     */
    @Override
    protected  Collection<ProgrammeVO> handleSearch(String code, String name)
        throws Exception
    {
        Search search = new Search();

        if(StringUtils.isNotBlank(code)) {
            SearchParameter param = new SearchParameter("code", code, SearchParameter.LIKE_COMPARATOR);
            search.addSearchParameter(param);
        }

        if(StringUtils.isNotBlank(name)) {
            SearchParameter param = new SearchParameter("name", name, SearchParameter.LIKE_COMPARATOR);
            search.addSearchParameter(param);
        }

        return (Collection<ProgrammeVO>) this.getProgrammeDao().search(ProgrammeDao.TRANSFORM_PROGRAMMEVO, search);

    }

    /**
     * @see bw.ac.ub.cs.programme.service.ProgrammeService#delete(Long)
     */
    @Override
    protected  void handleDelete(Long id)
        throws Exception
    {
        if(id != null) {
            this.getProgrammeDao().remove(id);
        }
    }

}