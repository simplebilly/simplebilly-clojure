(ns simple-billy-api.specs.tenant-settings
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.company-type :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def tenant-settings-data
  {
   (ds/req :companyType) company-type-spec
   (ds/opt :dpaAcceptedAt) inst?
   (ds/opt :dpaAcceptedBy) string?
   (ds/opt :dpaVersion) string?
   (ds/req :features) any-type-spec
   })

(def tenant-settings-spec
  (ds/spec
    {:name ::tenant-settings
     :spec tenant-settings-data}))
