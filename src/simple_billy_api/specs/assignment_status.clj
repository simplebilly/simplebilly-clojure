(ns simple-billy-api.specs.assignment-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def assignment-status-data
  {
   })

(def assignment-status-spec
  (ds/spec
    {:name ::assignment-status
     :spec assignment-status-data}))
