package com.cg.onlinepizza.repository;

import java.util.List;

import com.cg.onlinepizza.entity.Coupan;
import com.cg.onlinepizza.exception.CoupanIdNotFoundException;
import com.cg.onlinepizza.exception.InvalidCoupanOperationException;




public interface ICoupanRepository {

	Coupan addCoupans(Coupan coupan);

	Coupan editCoupans(Coupan coupan)throws InvalidCoupanOperationException;

	Coupan deleteCoupans(int coupanId)throws CoupanIdNotFoundException;

	List<Coupan> viewCoupans();
}
