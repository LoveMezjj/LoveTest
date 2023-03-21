package com.mvc.returndata;

import com.mvc.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserReturnData {
    private int statue;
    private String info;
    private User user;
}
