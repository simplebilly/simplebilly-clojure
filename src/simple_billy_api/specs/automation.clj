(ns simple-billy-api.specs.automation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def automation-data
  {
   (ds/req :automationKey) string?
   (ds/req :config) any-type-spec
   (ds/req :createdAt) inst?
   (ds/req :enabled) boolean?
   (ds/opt :lastRunAt) inst?
   (ds/opt :nextRunAt) inst?
   (ds/req :tenantId) uuid?
   (ds/req :updatedAt) inst?
   })

(def automation-spec
  (ds/spec
    {:name ::automation
     :spec automation-data}))
