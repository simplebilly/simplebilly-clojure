(ns simple-billy-api.specs.execution-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def execution-status-data
  {
   })

(def execution-status-spec
  (ds/spec
    {:name ::execution-status
     :spec execution-status-data}))
