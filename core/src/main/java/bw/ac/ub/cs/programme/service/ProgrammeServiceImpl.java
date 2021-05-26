// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: CSProject::bw.ac.ub.cs::programme::service::ProgrammeService
 * STEREOTYPE:  Service
 */
package bw.ac.ub.cs.programme.service;

import bw.ac.ub.cs.programme.vo.ProgrammeVO;
import java.util.Collection;
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
        // TODO implement protected  ProgrammeVO handleSave(ProgrammeVO programmeVO)
        throw new UnsupportedOperationException("bw.ac.ub.cs.programme.service.ProgrammeService.handleSave(ProgrammeVO programmeVO) Not implemented!");
    }

    /**
     * @see bw.ac.ub.cs.programme.service.ProgrammeService#findById(Long)
     */
    @Override
    protected  ProgrammeVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  ProgrammeVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.ac.ub.cs.programme.service.ProgrammeService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.ac.ub.cs.programme.service.ProgrammeService#loadAll()
     */
    @Override
    protected  Collection<ProgrammeVO> handleLoadAll()
        throws Exception
    {
        // TODO implement protected  Collection<ProgrammeVO> handleLoadAll()
        throw new UnsupportedOperationException("bw.ac.ub.cs.programme.service.ProgrammeService.handleLoadAll() Not implemented!");
    }

    /**
     * @see bw.ac.ub.cs.programme.service.ProgrammeService#search(String, String)
     */
    @Override
    protected  ProgrammeVO handleSearch(String code, String name)
        throws Exception
    {
        // TODO implement protected  ProgrammeVO handleSearch(String code, String name)
        throw new UnsupportedOperationException("bw.ac.ub.cs.programme.service.ProgrammeService.handleSearch(String code, String name) Not implemented!");
    }

    /**
     * @see bw.ac.ub.cs.programme.service.ProgrammeService#delete(Long)
     */
    @Override
    protected  void handleDelete(Long id)
        throws Exception
    {
        // TODO implement protected  void handleDelete(Long id)
        throw new UnsupportedOperationException("bw.ac.ub.cs.programme.service.ProgrammeService.handleDelete(Long id) Not implemented!");
    }

}