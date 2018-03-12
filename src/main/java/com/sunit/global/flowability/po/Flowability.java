package com.sunit.global.flowability.po; 
 
 
 
 
 
 
 
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.FilterDefs;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.Where;

import com.sunit.global.flowvariables.po.Flowvariables;

/**
 * Flowability generated by hbm2java
 */
@Entity
@Table(name="tb_flowability"
)
@FilterDefs({
	@FilterDef(  name="varOfLast",parameters={@ParamDef(type="string",name="elementId")} ),
	@FilterDef(  name="varName",parameters={@ParamDef(type="string",name="varName")} ),
	@FilterDef(  name="taskScope",parameters={@ParamDef(type="string",name="taskId")} )
	
})

@gen.SLH("{'formInputType':'DIV','width':'928','code':'tb_flowAbility','slhName':'tb_flowAbility','formLayout':'7'}")    
public class Flowability extends com.sunit.global.base.AbstractID implements java.io.Serializable {


			    @gen.SLH("{'formInputType':'text','width':'300','dbLength':'100','code':'activity_id','slhName':'activity_id'}")     
	 private String activityId;
	
			    @gen.SLH("{'formInputType':'text','width':'300','dbLength':'100','code':'po_id','slhName':'po_id'}")     
	 private String poId;
	
			    @gen.SLH("{'formInputType':'text','formValidate':'taskId','width':'300','dbLength':'100','code':'task_id','slhName':'task_id'}")     
	 private String taskId;
	
			    @gen.SLH("{'formInputType':'text','width':'300','dbLength':'100','code':'assignee_type','slhName':'assignee_type'}")     
	 private String assigneeType;
	
			    @gen.SLH("{'formInputType':'text','width':'300','dbLength':'100','code':'proccess_instance_id','slhName':'proccess_instance_id'}")     
	 private String proccessInstanceId;
	
			    @gen.SLH("{'formInputType':'text','width':'300','dbLength':'500','code':'assignee','slhName':'assignee'}")     
	 private String assignee;
	
			    @gen.SLH("{'formInputType':'text','width':'300','dbLength':'500','code':'candidate','slhName':'candidate'}")     
	 private String candidate;
	 
			     
     private String excutionId;
     
     private String proccessInstanceKey;
     
     private String proccessInstanceVersion;
     
     private String remark;
     
     
     private String  assigneeName ;
     
     private String createTime   ;

     private String  updateTime;
     
     private String  lastProcessor;
     
     private String  taskTitle;
     
     private String  starter;
     
     
     
     
	private List<Flowvariables> variables=new ArrayList();
   
		    
	private List<Flowvariables> variablesOfStartFlow=new ArrayList();
	
	
	private List<Flowvariables> variablesOfStartFlowAuditIdea=new ArrayList();
	
	
	private List<Flowvariables> variablesOfLastForMemberaudit=new ArrayList();
	

	private List<Flowvariables> variablesOfLast=new ArrayList() ;
	
	
	private Flowvariables variablesOfLastOne ; 
	


	@Column(name="starter", length=100)
	public String getStarter() { 
		return starter;
	}



	public void setStarter(String starter) {
		this.starter = starter;
	}



	@Column(name="assignee_name", length=200)
	 public String getAssigneeName() {
		return assigneeName;
	}



	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}


	@Column(name="create_time", length=100)
	public String getCreateTime() {
		return createTime;
	}



	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}


	@Column(name="update_time", length=100)
	public String getUpdateTime() {
		return updateTime;
	}



	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}


	 
	@Column(name="last_processor", length=100)
	public String getLastProcessor() {
		return lastProcessor;
	}



	public void setLastProcessor(String lastProcessor) {
		this.lastProcessor = lastProcessor;
	}

 
	@Column(name="task_title", length=200)
	public String getTaskTitle() {
		return taskTitle;
	}



	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}



	@Column(name="excution_id", length=100)
	public String getExcutionId() {
		return excutionId;
	}



	public void setExcutionId(String excutionId) {
		this.excutionId = excutionId;
	}


	@Column(name="proccess_instance_key", length=100)
	public String getProccessInstanceKey() {
		return proccessInstanceKey;
	}



	public void setProccessInstanceKey(String proccessInstanceKey) {
		this.proccessInstanceKey = proccessInstanceKey;
	}

	@Column(name="proccess_instance_version", length=100)
	public String getProccessInstanceVersion() {
		return proccessInstanceVersion;
	}



	public void setProccessInstanceVersion(String proccessInstanceVersion) {
		this.proccessInstanceVersion = proccessInstanceVersion;
	}


	@Column(name="remark", length=100) 
	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}



	@Transient
	public Flowvariables getVariablesOfLastOne() {
		variablesOfLastOne =this.getVariablesOfLast().isEmpty()?null:this.getVariablesOfLast().get(0);
		return variablesOfLastOne; 
	}
 


	public void setVariablesOfLastOne(Flowvariables variablesOfLastOne) {
		this.variablesOfLastOne = variablesOfLastOne;
	}



	@Filter(name="varOfLast", condition="    fv_time = ( select max(ifv.fv_time) from  tb_flowvariables  ifv where ifv.fv_proc_inst_id=:elementId ) and fv_name='memberauditIdea' ")
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Flowvariables.class)   
	@JoinColumn(name="fv_proc_inst_id", referencedColumnName="proccess_instance_id",insertable=false,updatable=false,nullable=true)     
	public List<Flowvariables> getVariablesOfLastForMemberaudit() {
		return variablesOfLastForMemberaudit;
	}


  
	public void setVariablesOfLastForMemberaudit(
			List<Flowvariables> variablesOfLastForMemberaudit) {
		this.variablesOfLastForMemberaudit = variablesOfLastForMemberaudit;
	}


	
	@Filter(name="varOfLast", condition="    fv_time = ( select max(ifv.fv_time) from  tb_flowvariables  ifv where ifv.fv_proc_inst_id=:elementId ) ")
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Flowvariables.class)  
	@JoinColumn(name="fv_proc_inst_id", referencedColumnName="proccess_instance_id",insertable=false,updatable=false,nullable=true)     
	public List<Flowvariables> getVariablesOfLast() { 
		return variablesOfLast;
	} 




	public void setVariablesOfLast(List<Flowvariables> variablesOfLast) {
		this.variablesOfLast = variablesOfLast;
	}




	@Where(clause="fv_action ='start'") 
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Flowvariables.class)  
	@JoinColumn(name="fv_proc_inst_id", referencedColumnName="proccess_instance_id",insertable=false,updatable=false,nullable=true)     
   public List<Flowvariables> getVariablesOfStartFlow() { 
		return variablesOfStartFlow;
	} 
 
	
		

	public void setVariablesOfStartFlow(List<Flowvariables> variablesOfStartFlow) {
		this.variablesOfStartFlow = variablesOfStartFlow;
	}


	
	
	@Where(clause="fv_name ='auditIdea'") 
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Flowvariables.class)  
	@JoinColumn(name="fv_proc_inst_id", referencedColumnName="proccess_instance_id",insertable=false,updatable=false,nullable=true)     
	public List<Flowvariables> getVariablesOfStartFlowAuditIdea() {
		return variablesOfStartFlowAuditIdea;
	}




	public void setVariablesOfStartFlowAuditIdea(
			List<Flowvariables> variablesOfStartFlowAuditIdea) {
		this.variablesOfStartFlowAuditIdea = variablesOfStartFlowAuditIdea;
	}


	@Filters({
		@Filter(name="varName", condition=" fv_name = :varName   ")  , 
		@Filter(name="taskScope", condition=" = fv_taskId = :taskId   ")
	})
	
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Flowvariables.class)  
	@JoinColumn(name="fv_proc_inst_id", referencedColumnName="proccess_instance_id",insertable=false,updatable=false,nullable=true)    
	public List<Flowvariables> getVariables() {
		return variables;
	}


	public void setVariables(List<Flowvariables> variables) {
		this.variables = variables;
	}

	
	
	
	
	public Flowability() {
    }

	
    public Flowability(String id) {
        this.id = id;
    }
    public Flowability(String id, String activityId, String poId, String taskId, String assigneeType, String proccessInstanceId, String assignee, String candidate) {
       this.id = id;
       this.activityId = activityId;
       this.poId = poId;
       this.taskId = taskId;
       this.assigneeType = assigneeType;
       this.proccessInstanceId = proccessInstanceId;
       this.assignee = assignee;
       this.candidate = candidate;
    }
   

    
    @Column(name="activity_id", length=100)
	    public String getActivityId() {
	        return this.activityId;
	    }
	    
	    public void setActivityId(String activityId) {
	        this.activityId = activityId;
	    }

    
    @Column(name="po_id", length=100)
	    public String getPoId() {
	        return this.poId;
	    }
	    
	    public void setPoId(String poId) {
	        this.poId = poId;
	    }

    
    @Column(name="task_id", length=100)
	    public String getTaskId() {
	        return this.taskId;
	    }
	    
	    public void setTaskId(String taskId) {
	        this.taskId = taskId;
	    }

    
    @Column(name="assignee_type", length=100)
	    public String getAssigneeType() {
	        return this.assigneeType;
	    }
	    
	    public void setAssigneeType(String assigneeType) {
	        this.assigneeType = assigneeType;
	    }

    
    @Column(name="proccess_instance_id", length=100)
	    public String getProccessInstanceId() {
	        return this.proccessInstanceId;
	    }
	    
	    public void setProccessInstanceId(String proccessInstanceId) {
	        this.proccessInstanceId = proccessInstanceId;
	    }

    
    @Column(name="assignee")
	    public String getAssignee() {
	        return this.assignee;
	    }
	    
	    public void setAssignee(String assignee) {
	        this.assignee = assignee;
	    }

    
    @Column(name="candidate")
	    public String getCandidate() {
	        return this.candidate;
	    }
	    
	    public void setCandidate(String candidate) {
	        this.candidate = candidate;
	    }


	 


}


  