(ns simple-billy-api.specs.service-assignment-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def service-assignment-status-data
  {
   })

(def service-assignment-status-spec
  (ds/spec
    {:name ::service-assignment-status
     :spec service-assignment-status-data}))
