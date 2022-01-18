package aaa.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GenMapper {
	
	List<BoardDTO> bblist();
	
	int genInsert(ArrDTO arr);

	int genInsert2(ArrDTO arr);
	
	int genInsert3(ArrDTO arr);
}
