// App.js
import React, { useState } from 'react';
import LoginForm from './components/LoginForm';
import UserDetails from './components/UserDetails';

const App = () => {
  const [id, setId] = useState('');

  const handleLogin = (id) => {
    setId(id);
  };

  return (
    <div>
      
        <UserDetails id={id} />
      
    </div>
  );
};

export default App;
