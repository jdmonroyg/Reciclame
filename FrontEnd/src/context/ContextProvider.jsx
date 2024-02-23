"use client";

import React, { createContext, useState } from "react";

export const Context = createContext();

export default function ContextProvider({ children }) {
  const [isLogged, setIsLogged] = useState(false);
  console.log(isLogged);
  return (
    <Context.Provider value={{ isLogged, setIsLogged }}>
      {children}
    </Context.Provider>
  );
}
