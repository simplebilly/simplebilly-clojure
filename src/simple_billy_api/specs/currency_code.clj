(ns simple-billy-api.specs.currency-code
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def currency-code-data
  {
   })

(def currency-code-spec
  (ds/spec
    {:name ::currency-code
     :spec currency-code-data}))
