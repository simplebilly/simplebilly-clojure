(ns simple-billy-api.specs.mirror-trigger-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def mirror-trigger-response-data
  {
   (ds/req :job_id) string?
   })

(def mirror-trigger-response-spec
  (ds/spec
    {:name ::mirror-trigger-response
     :spec mirror-trigger-response-data}))
