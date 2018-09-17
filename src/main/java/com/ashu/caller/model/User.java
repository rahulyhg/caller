package com.ashu.caller.model;

import com.ashu.caller.util.FirstGroup;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.groups.Default;

@Getter
@Setter
public class User {

    @NotEmpty(groups = {FirstGroup.class, Default.class})
    private String mobile;
    @NotEmpty
    private String name;
    private String email;
    private String profilePic;
}
