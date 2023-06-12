// LoginForm.js
import React, { useState } from 'react';
import axios from 'axios';
import { URL } from '../config'

const LoginForm = ({ onLogin }) => {
  const [id, setId] = useState('');
//   const [password, setPassword] = useState('');

  const handleLogin = async (e) => {
    e.preventDefault();

    try {
      // Send login credentials to the backend for authentication
      const response = await axios.post(`${URL}/users/`, { id });
      if (response.status === 200) {
        onLogin(id);
      }
    } catch (error) {
      console.error('Error logging in:', error);
    }
  };

  return (
    <form onSubmit={handleLogin}>
      <input
        type="number"
        placeholder="UserId"
        value={id}
        onChange={(e) => setId(e.target.value)}
      />
      {/* <input
        type="password"
        placeholder="Password"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
      /> */}
      <button type="submit">Login</button>
    </form>
  );
};

export default LoginForm;
