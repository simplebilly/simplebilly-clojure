(ns simple-billy-api.specs.emission-method
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def emission-method-data
  {
   })

(def emission-method-spec
  (ds/spec
    {:name ::emission-method
     :spec emission-method-data}))
