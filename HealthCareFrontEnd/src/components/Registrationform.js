// RegistrationForm.js
import React, { useState } from 'react';
import axios from 'axios';
import { URL } from '../config'

const RegistrationForm = ({ onRegister }) => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [age, setAge] = useState('');
  const [address, setAddress] = useState('');
  const [mobileNo, setMobileNo] = useState('');

  const handleRegister = async (e) => {
    e.preventDefault();

    try {
      // Send registration data to the backend for account creation
      const response = await axios.post(`${URL}/signUp`, { username,  password,age,address,mobileNo });
      if (response.status === 201) {
        onRegister(username);
      }
    } catch (error) {
      console.error('Error registering:', error);
    }
  };

  return (
    <form onSubmit={handleRegister}>
      <input
        type="text"
        placeholder="Username"
        value={username}
        onChange={(e) => setUsername(e.target.value)}
      />
      <input
        type="password"
        placeholder="Password"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
      />
      <input
        type="number"
        placeholder="age"
        value={age}
        onChange={(e) => setAge(e.target.value)}
      />

    <input
        type="text"
        placeholder="address"
        value={address}
        onChange={(e) => setaddress(e.target.value)}
      />

     <input
        type="text"
        placeholder="mobile"
        value={mobileNo}
        onChange={(e) => setMobileNo(e.target.value)}
      />
      <button type="submit">Register</button>
    </form>
  );
};

export default RegistrationForm;
