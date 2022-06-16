package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Point;
import ks43team01.dto.PointStandard;
import ks43team01.dto.PointStandardDetails;


@Mapper
public interface PointMapper {
	//회원 포인트 상세내역
	public List<Point> getPointList();
	
	//포인트 기준코드 
	public PointStandard getPointStandard();
	
	//포인트 내용 기준 코드 
	public PointStandardDetails getPointStandardDetails();
}
