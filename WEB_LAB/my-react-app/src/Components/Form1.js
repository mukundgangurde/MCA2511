
import React,{useState} from "react";
import '../App.css';
import { data } from "react-router-dom";

function Form1(){
    const [formData, setFormData] = useState({
        username:'',
        email:'',
        password:'',
        confirmPassword:'',
    });

    const [errors, setErrors] = useState({});
    const handleChange = (e) => {
        const { name , value } = e.target;
        setFormData({
            ...formData,
            [name]:value,
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        const newErrors = validateForm(formData);
        setErrors(newErrors);
        if(Object.keys(newErrors).length === 0){
            alert('Form submitted successfully !!');
        }
        else{
            alert('Submission failed due to errors !!');
        }
    };

    const validateForm = (data) =>{
        const errors = {};
        if(!data.username.trim()){
            errors.username = 'Username is required !!';
        }
        else if(data.username.length < 6)
        {
            errors.username = 'Username must be at least 6 characters';
        }
        if(!data.email.trim())
        {
            errors.email = 'Email is required !!';
        }

        if(!data.password.trim())
        {
            errors.password = 'Password is required';
        }
        else if(data.password.length < 8){
            errors.password = 'password must be atleast 8 character long';
        }
        if(data.confirmPassword != data.password){
            errors.confirmPassword = 'Password does not match !!';
        }
        return errors;
    }

    return (
  <>
    <form onSubmit={handleSubmit} className="form">
      <h1>Registration Form</h1>
      <div>
        <label>Username</label><br></br>
        <input
          type="text"
          name="username"
          value={formData.username}
          onChange={handleChange}
        />
        {errors.username && <p className="error">{errors.username}</p>}
      </div><br></br>

      <div>
        <label>Email</label><br></br>
        <input
          type="email"
          name="email"
          value={formData.email}
          onChange={handleChange}
        />
        {errors.email && <p className="error">{errors.email}</p>}
      </div><br></br>

      <div>
        <label>Password</label><br></br>
        <input
          type="password"
          name="password"
          value={formData.password}
          onChange={handleChange}
        />
        {errors.password && <p className="error">{errors.password}</p>}
      </div><br></br>

      <div>
        <label>Confirm Password</label><br></br>
        <input
          type="password"
          name="confirmPassword"
          value={formData.confirmPassword}
          onChange={handleChange}
        />
        {errors.confirmPassword && (
          <p className="error">{errors.confirmPassword}</p>
        )}
      </div><br></br>

      <button type="submit">Submit</button>
    </form>
  </>
);

}
export default Form1;
