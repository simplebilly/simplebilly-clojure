(ns simple-billy-api.specs.application-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def application-status-data
  {
   })

(def application-status-spec
  (ds/spec
    {:name ::application-status
     :spec application-status-data}))
