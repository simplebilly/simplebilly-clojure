(ns simple-billy-api.specs.participation-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def participation-create-data
  {
   (ds/opt :acquiredAt) inst?
   (ds/opt :boardAppointment) boolean?
   (ds/opt :companyName) string?
   (ds/opt :controlAgreement) boolean?
   (ds/opt :legalForm) string?
   (ds/opt :ownershipPct) string?
   (ds/opt :purposeVehicle) boolean?
   (ds/opt :votingMajority) boolean?
   })

(def participation-create-spec
  (ds/spec
    {:name ::participation-create
     :spec participation-create-data}))
