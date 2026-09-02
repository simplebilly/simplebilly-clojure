(ns simple-billy-api.specs.employment-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def employment-type-data
  {
   })

(def employment-type-spec
  (ds/spec
    {:name ::employment-type
     :spec employment-type-data}))
