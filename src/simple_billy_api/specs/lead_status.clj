(ns simple-billy-api.specs.lead-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lead-status-data
  {
   })

(def lead-status-spec
  (ds/spec
    {:name ::lead-status
     :spec lead-status-data}))
